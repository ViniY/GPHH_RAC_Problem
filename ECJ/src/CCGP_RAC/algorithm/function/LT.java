package CCGP_RAC.algorithm.function;

import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import CCGP_RAC.algorithm.terminals.DoubleData;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;

public class LT extends GPNode {
    @Override
    public String toString() {
        return "<";
    }

    @Override
    public void eval(final EvolutionState state,
                     final int thread,
                     final GPData input,
                     final ADFStack stack,
                     final GPIndividual individual,
                     final Problem problem) {
        int result;
        double leftResult;
        double rightResult;

        DoubleData rd = ((DoubleData)(input));

        // evaluate left child
        children[0].eval(state,thread,input,stack,individual,problem);
        leftResult = rd.x;

        // evaluate right child
        children[1].eval(state,thread,input,stack,individual,problem);
        rightResult = rd.x;

        if(leftResult < rightResult){
            result = 1;
        } else {
            result = -1;
        }
        rd.x = new Double(result);

    }
}
