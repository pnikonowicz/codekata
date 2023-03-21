# Create Regions

Now that a GemFire cluster is running we should want to do something with it. One of the more common
uses for GemFire is to store data. In order to do that, we need to specify where data goes. 
And for that, we introduce regions. Let's create some regions now.

```plain
./gemfire/bin/gfsh -e 'connect' -e 'create region --name=demo --type=PARTITION'
```{{exec}}

Partitioned regions have a really important purpose that is covered more [in the docs](https://docs.vmware.com/en/VMware-Tanzu-GemFire/9.15/tgf/GUID-developing-partitioned_regions-how_pr_ha_works.html)
 but for now, all that you need to know is that we have a place to store our data. 


