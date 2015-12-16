# SimpleOCL is an embeddable OCL implementation #

SimpleOCL is an embeddable [OCL](http://www.omg.org/spec/OCL) implementation for inclusion in transformation languages for the EMF Transformation Virtual Machine (EMFTVM). SimpleOCL is built on top of the [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/modeling/emf/) and [EMFText](http://www.emftext.org).

Below you can find an example of SimpleOCL code:

![http://simpleocl.eclipselabs.org.codespot.com/git.wiki/simpleocl.png](http://simpleocl.eclipselabs.org.codespot.com/git.wiki/simpleocl.png)

This code defines a couple of attributes and operations. Note that we've added the Lambda type, so you can define your own iterator expressions, e.g.:

```OCL>list-
map(x | x*2)```

More examples can be found in <a href='https://code.google.com/a/eclipselabs.org/p/simpleocl/source/browse/org.eclipselabs.simpleocl.tests/test-data/iterators.simpleocl'>iterators.simpleocl</a>.

To facilitate better integration with Java code, we've also added support for static attributes/operations. These are invoked using the `::` operator instead of the `.` operator. Finally, all attributes/operations without a defined context fall in the `Env` context, which stands for the environment. The environment has a single runtime instance, which can be accessed using the `env` keyword.

SimpleOCL does **not** support OCL's `pre`, `post`, and `inv` declarations. It is intended as a navigation language to be embedded in model transformation languages, and therefore only supports `def` declarations. That said, EMFTVM's integration with Java allows you to do much more.

## Installation ##

To download and install the SimpleOCL Eclipse plugin, install it from the following Eclipse update site:

  * <a href='http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=609072' title='Drag and drop into a running Eclipse Indigo workspace to install SimpleOCL'><img src='https://marketplace.eclipse.org/sites/all/modules/custom/marketplace/images/installbutton.png' align='middle' /></a> or http://simpleocl.eclipselabs.org.codespot.com/git.updatesite

## Running SimpleOCL/EMFTVM modules ##

Note that SimpleOCL modules don't do anything normally, unless you define a static `main` operation:

```OCL

static def : main() : OclAny = ...
```

EMFTVM includes a separate launch configuration dialog that looks very much like ATL's launch configuration dialog. It can be found via "Run -> Run Configurations...".

![http://wiki.eclipse.org/images/d/d4/Emftvmlaunchconfiguration.png](http://wiki.eclipse.org/images/d/d4/Emftvmlaunchconfiguration.png)

## Links ##

  * [ATL/EMFTVM documentation on Eclipse.org](http://wiki.eclipse.org/ATL/EMFTVM)