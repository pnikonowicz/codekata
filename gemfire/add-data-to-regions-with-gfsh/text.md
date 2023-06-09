# Add Data to Regions with gfsh

So far we have done the following:
* started a cluster
* created a region

It's time to add some data. Adding data using gfsh is just as simple as everything else we've done so far. 

```plain
./gemfire/bin/gfsh -e 'connect' -e 'put --key=my_key --value=my_value --region=demo'
```{{exec}}

And that's it! Feel free to add as much data as you want. If you wan to see the data, that's easy as well.

```plain
./gemfire/bin/gfsh -e 'connect' -e 'get --key=my_key --region=demo'
```{{exec}}


Or if we want to see all of the values that our region contains we can do so with a simple query

```plain
./gemfire/bin/gfsh -e 'connect' -e 'query --query="select * from /demo"'
```{{exec}}
