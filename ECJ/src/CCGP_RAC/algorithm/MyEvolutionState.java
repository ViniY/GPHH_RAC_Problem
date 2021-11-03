package CCGP_RAC.algorithm;

import ec.simple.SimpleEvolutionState;

import java.util.ArrayList;

public class MyEvolutionState extends SimpleEvolutionState{
//    public double PMCPU[];
//    public double PMMEM[];
    public double PMENERGY;
    public ArrayList<Double[]> PMConfig;
    // A list of containers
    private ArrayList<ArrayList<Double[]>> inputX = new ArrayList<>();

    // A list of candidate VMs, each vm has an array which includes its CPU and Mem capacity
    private ArrayList<Double[]> vmTypeList = new ArrayList<>();

    // An array of OS probability
    private ArrayList<Double> OSPro = new ArrayList<>();

    // An array of benchmark accumulated energy
    private ArrayList<Double> benchmark = new ArrayList<>();


    // Initialization data
    ArrayList <ArrayList> initPm;
    ArrayList <ArrayList> initVm;
    ArrayList <ArrayList> initOs;
    ArrayList <ArrayList> initContainer;


    private double vmCpuOverheadRate;
    private double vmMemOverhead;

    public double containerCpu;
    public double containerMem;
    public int containerOs;
    public double containerOsPro;


    public double normalizedContainerCpu;
    public double normalizedContainerMem;
    public double normalizedVmCpuRemain;
    public double normalizedVmMemRemain;
    public double normalizedVmCpuCapacity;
    public double normalizedVmMemCapacity;


    public double currentPmCpuRemain;
    public double currentPmMemRemain;


    public double normalizedVmCpuOverhead;
    public double normalizedVmMemOverhead;



    public double normalizedPmCpuRemain;
    public double normalizedPmMemRemain;

    public double normalizedPmActualCpuUsed;
    public double normalizedPmActualMemUsed;

    public double normalizedVmActualCpuUsed;
    public double normalizedVmActualMemUsed;


    public double normalizedUtilization;

    public double arrivalTime;// ???

    public double movingAverage;// this can be used to capture the utilization over time

    public MyEvolutionState(){
        super();
    }

}
