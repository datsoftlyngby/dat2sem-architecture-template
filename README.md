# Module 3 Architecture example project

The project implements a very simple web-application.
The following state machine models the site map:

![Site map](docs/states.png)  
*Figure 1 - Site map state machine*

The project uses a layered architecture.
The layering is not strict,
because the `view` layer references other layers than the layer immediately below, namely the `control` layer.
It also references the `model` layer.

![Layers](docs/layers.png)  
*Figure 2 - Layers*

## The `view` layer

Also known as:
* presentation layer

## The `control` layer

Also known as:
* function layer
* business logic layer

## The `model` layer

Also known as:
* data layer
* data access layer
* entity layer
