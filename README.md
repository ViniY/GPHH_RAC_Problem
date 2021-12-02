<h1>GPHH RAC Problem</h1>

<p style ="text-align:left">  This is a research project for energy efficiency resource allocation in a container-based cloud environment through a Genetic Programming Approach. 
    Comparing to current approaches, the newly proposed approach can consider a large variety information regarding the requirements from containers and also the features of the known resources.
    In this repo, I will introduce the benchmark dataset we have used and how we processed the dataset, followed with a short description of the problem model and short introduction on our algorithm.</p>
<h2> Dataset Description</h2>
 <p style="text-align: left;">In this project, we are using two tracing datasets. The dataset for Physical Machines and VMs is from real-world.</p>
<h3> GWA-T-12 BitBrains </h3>
<h4> Format </h4> 
<div> 
<p style ="text-align: left;">Timestamp</p>
<p style ="text-align: left;">CPU cores</p>
<p style ="text-align: left;">CPU capacity provisioned</p>
<p style ="text-align: left;">CPU usage (MHz)</p>
<p style ="text-align: left;">CPU usage (%)</p>
<p style ="text-align: left;">Memory Provisioned</p>
<p style ="text-align: left;">Memory Usage</p>
<p style ="text-align: left;">Disk read throughtput</p>
<p style ="text-align: left;">Disk write throughtput</p>
<p style ="text-align: left;">Network received throughtput</p>
<p style ="text-align: left;">Network transmitted throughtput</p>
</div>
<h3> VMs </h3>
<p>The data for VMs is from Amazon EC2.</p>
<!-- <style type="text/css">
    .tg  {border-collapse:collapse;border-spacing:0;}
    .tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
      overflow:hidden;padding:10px 5px;word-break:normal;}
    .tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
      font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
    .tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
    .tg .tg-0lax{text-align:left;vertical-align:top}
    .tg .tg-7hap{font-size:20px;font-weight:bold;text-align:left;vertical-align:top}
    </style> -->
    <div style="text-align: center;">
        <table class="tg">
        <thead>
        <tr>
            <th class="tg-0pky" style="text-align: center;">VM Type</th>
            <th class="tg-0lax" style="text-align: center;"> CPU(core) </th>
            <th class="tg-0pky" style="text-align: center;"> Memory(GB)</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td class="tg-0lax" style="text-align: center;"> c5.large </td>
            <td class="tg-0lax" style="text-align: center;">    2     </td>
            <td class="tg-0lax" style="text-align: center;">    4     </td>
        </tr>
        <tr>
            <td class="tg-0lax" style="text-align: center;"> c5.xlarge </td>
            <td class="tg-0lax" style="text-align: center;">    4      </td>
            <td class="tg-0lax" style="text-align: center;">    8      </td>
        </tr>
        <tr>
            <td class="tg-0lax" style="text-align: center;"> c5.2xlarge </td>
            <td class="tg-0lax" style="text-align: center;">    8       </td>
            <td class="tg-0lax" style="text-align: center;">    16      </td>
        </tr>
        <tr>
            <td class="tg-0lax" style="text-align: center;"> c5.4xlarge </td>
            <td class="tg-0lax" style="text-align: center;">    16      </td>
            <td class="tg-0lax" style="text-align: center;">    32      </td>
        </tr>
        <tr>
            <td class="tg-0lax" style="text-align: center;"> c5.9xlarge </td>
            <td class="tg-0lax" style="text-align: center;">    36       </td>
            <td class="tg-0lax" style="text-align: center;">    72       </td>
        </tr>
        <tr>
            <td class="tg-0pky" style="text-align: center;"> c5a.8xlarge </td>
            <td class="tg-0lax" style="text-align: center;">    32       </td>
            <td class="tg-0pky" style="text-align: center;">    64       </td>
        </tr>
        <tr>
            <td class="tg-0pky" style="text-align: center;"> c5a.12xlarge </td>
            <td class="tg-0lax" style="text-align: center;">     48       </td>
            <td class="tg-0pky" style="text-align: center;">     96       </td>
        </tr>
        <tr>
            <td class="tg-0pky" style="text-align: center;"> c5a.16xlarge</td>
            <td class="tg-0lax" style="text-align: center;">     64      </td>
            <td class="tg-0pky" style="text-align: center;">     128     </td>
        </tr>
        </tbody>
        </table>
    </div>
<h2> Data Processing</h2>
<p>In this part, we process the data to fit the model.</p>
<h3> Filtering </h3>
<p style="text-align: left;">
There are some records cannot be used due to the requirements of memory or cpu are over the limitation
by the physical machines we are having in the datacenter. 
</p>




