package CCGP_RAC.algorithm.terminals.features;


import ec.EvolutionState;
import ec.Problem;
import ec.gp.ADFStack;
import ec.gp.GPData;
import ec.gp.GPIndividual;
import ec.gp.GPNode;
import CCGP_RAC.algorithm.terminals.DoubleData;
import CCGP_RAC.algorithm.MyEvolutionState;
import CCGP_RAC.algorithm.ContainerAllocationProblem;


public class LeftVmCPU extends GPNode {
    public String toString() {return "leftVmCpu";}
    public int expectedChildren() { return 0; }

    public void eval(final EvolutionState state,
                     final int thread,
                     final GPData input,
                     final ADFStack stack,
                     final GPIndividual individual,
                     final Problem problem){
        DoubleData rd = (DoubleData)(input);

        MyEvolutionState myState = (MyEvolutionState)state;
        ContainerAllocationProblem p = (ContainerAllocationProblem) problem;
//        rd.x = p.normalizedVmCpuCapacity - p.normalizedContainerCpu;
        rd.x = myState.normalizedVmCpuRemain - myState.normalizedContainerCpu;
//        rd.x = myState.normalizedVmCpuCapacity- myState.normalizedContainerCpu;
    }
}
