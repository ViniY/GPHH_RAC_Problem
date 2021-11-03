package CCGP_RAC.algorithm.terminals.features;

import CCGP_RAC.algorithm.MyEvolutionState;
import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;
import CCGP_RAC.algorithm.terminals.DoubleData;

public class VMMemOverhead extends GPNode {
    @Override
    public String toString() {return "VMMemOverhead";}

    @Override
    public void eval(final EvolutionState state,
                     final int thread,
                     final GPData input,
                     final ADFStack stack,
                     final GPIndividual individual,
                     final Problem problem){
        DoubleData rd = (DoubleData)(input);

//        ContainerAllocationProblem p = (ContainerAllocationProblem) problem;
//        rd.x = p.normalizedVmCpuOverhead;

        rd.x = ((MyEvolutionState)state).normalizedVmMemOverhead;
    }
}
