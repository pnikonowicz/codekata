# Install pivnet-cli

The pivnet cli allows you to access products from [tanz-net](https://network.tanzu.vmware.com/). 

First, download the cli from GitHub.

```plain
wget https://github.com/pivotal-cf/pivnet-cli/releases/download/v3.0.1/pivnet-linux-amd64-3.0.1
```{{exec}}

Then do a quick rename and change the file permissions so that the cli is executable

```plain
mv pivnet-linux-amd64-3.0.1 pivnet
chmod 766 pivnet
```{{exec}}

Now lets make sure it's working ok

```plain
./pivnet --version
```{{exec}}

