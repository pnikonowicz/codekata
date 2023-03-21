# add data to regions with client


Adding data using a cli isn't the only way that we can enter data into a region. There are a lot of ways,
one of the more popular is to use a GemFire client. We just so happen to have a small client application here. 

```plain
cat /root/client.java
```{{exec}

Should be simple enough, we just connect to the cluster and insert some data. Let's run it. 

```plain
javac /root/client.java && java Client
```{{exec}}

Now, if we want to see all of the keys that our region contains we can do so with a simple query:

```plain
./gemfire/bin/gfsh -e 'connect --name=locator' -e 'query --query="select * from /demo"'
```{{exec}}


