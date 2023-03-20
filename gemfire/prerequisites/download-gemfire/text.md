# gemfire

Now we will download GemFire from TanzuNet using the pivnet-cli.

It is assumed that you have already done the following:
* Create an account on https://network.tanzu.vmware.com/
* Sign the EULA for GemFire at https://network.tanzu.vmware.com/products/pivotal-gemfire/
* Retrieve your `Legacy API token` from: https://network.tanzu.vmware.com/users/dashboard/edit-profile

With the `Legacy API token` we can login to TanzuNet using the pivnet-cli that we have already installed.

Assign your token to the `TANZU_NET_TOKEN` envionment variable using:
```
export TANZU_NET_TOKEN="<YOUR_TOKEN>"
```

Let make sure it is set properly
```plain
[[ ! -z "${TANZU_NET_TOKEN}" ]] || echo "TANZU_NET_TOKEN not set"
```{{exec}}


Now we will log into to TanzuNet using the cli

```plain
./pivnet login --api-token="${TANZU_NET_TOKEN}"
```{{exec}}


Lets take a look at the products we have available to us.
```plain
./pivnet products
```{{exec}}

Make sure that GemFire appears in this list, otherwise you will need to sign the EULA https://network.tanzu.vmware.com/products/pivotal-gemfire/

<br>

And now we will download GemFire
```plain
./pivnet download-product-files --product-slug='pivotal-gemfire' --release-version='9.15.4' --product-file-id=1424916
```{{exec}}