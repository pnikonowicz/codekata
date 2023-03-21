# Install GemFire

We only need to do a few things here in order to install GemFire.

```plain
tar xzvf vmware-gemfire-*.tgz
rm *.tgz
mv vmware-gemfire-* gemfire
```{{exec}}

And then test to make sure that we can access Gfsh. Gfsh is the main tool we will use to create members and add regions to our cluster. 

```plain
./gemfire/bin/gfsh -e version
```{{exec}}
