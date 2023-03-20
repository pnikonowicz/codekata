# gemfire

Now we will install GemFire from TanzuNet using the pivnet-cli.

We only need to do a few things here in order to install GemFire

First, we need to untar the file that we got from TanzuNet

```plain
tar xzvf vmware-gemfire-*.tgz
rm *.tgz
mv vmware-gemfire-* gemfire
```{{exec}}

And then test to make sure that we can access Gfsh. Gfsh is the main tool we will use to create members and add regions to our cluster. 

```plain
./gemfire/bin/gfsh -e help
```{{exec}}
