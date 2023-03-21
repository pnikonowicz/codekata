# add data to regions with gfsh

So far we have done the following:
* started a cluster
* created a region

It's time to add some data. Adding data using gfsh is just as simple as everything else we've done so far. 

```plain
./gemfire/bin/gfsh -e 'connect --name=locator' -e 'put --key=my_key --value=my_value --region=demo'
```

And that's it! Feel free to add as much data as you want. If you wan to see the data, that's easy as well.

```plain
./gemfire/bin/gfsh -e 'connect --name=locator' -e 'get --key=my_key --region=demo'
```
