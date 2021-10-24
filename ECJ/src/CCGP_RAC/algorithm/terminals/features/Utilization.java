package CCGP_RAC.algorithm.terminals.features;

import CCGP_RAC.algorithm.MyEvolutionState;
import CCGP_RAC.algorithm.function.DoubleData;
import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;

public class Utilization extends GPNode {
    @Override
    public String toString() {return "Util";}

    @Override
    public void eval(final EvolutionState state,
                     final int thread,
                     final GPData input,
                     final ADFStack stack,
                     final GPIndividual individual,
                     final Problem problem) {
        DoubleData rd = (DoubleData)(input);
        MyEvolutionState myState = (MyEvolutionState) state;
        rd.x = myState.normalizedUtilization;
    }
}
