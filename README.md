## Bridge Pattern

###Intent<br/>
•Decouple an abstraction from its implementation so that the two can vary independently.<br/>
•Publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy.<br/>
•Beyond encapsulation, to insulation<br/>

###Problem

"Hardening of the software arteries" has occurred by using subclassing of an abstract base class to provide alternative implementations. This locks in compile-time binding between interface and implementation. The abstraction and implementation cannot be independently extended or composed.

###Discussion

Decompose the component's interface and implementation into orthogonal class hierarchies. The interface class contains a pointer to the abstract implementation class. This pointer is initialized with an instance of a concrete implementation class, but all subsequent interaction from the interface class to the implementation class is limited to the abstraction maintained in the implementation base class. The client interacts with the interface class, and it in turn "delegates" all requests to the implementation class.

The interface object is the "handle" known and used by the client; while the implementation object, or "body", is safely encapsulated to ensure that it may continue to evolve, or be entirely replaced (or shared at run-time.

###Use the Bridge pattern when:<br/>
•you want run-time binding of the implementation,<br/>
•you have a proliferation of classes resulting from a coupled interface and numerous implementations,<br/>
•you want to share an implementation among multiple objects,<br/>
•you need to map orthogonal class hierarchies.<br/>

###Consequences include:<br/>
•decoupling the object's interface,<br/>
•improved extensibility (you can extend (i.e. subclass) the abstraction and implementation hierarchies independently),<br/>
•hiding details from clients.<br/>

Bridge is a synonym for the "handle/body" idiom. This is a design mechanism that encapsulates an implementation class inside of an interface class. The former is the body, and the latter is the handle. The handle is viewed by the user as the actual class, but the work is done in the body. "The handle/body class idiom may be used to decompose a complex abstraction into smaller, more manageable classes. The idiom may reflect the sharing of a single resource by multiple classes that control access to it (e.g. reference counting)."

###Structure

The Client doesn’t want to deal with platform-dependent details. The Bridge pattern encapsulates this complexity behind an abstraction "wrapper".

Bridge emphasizes identifying and decoupling "interface" abstraction from "implementation" abstraction.

The Bridge pattern decouples an abstraction from its implementation, so that the two can vary independently. A household switch controlling lights, ceiling fans, etc. is an example of the Bridge. The purpose of the switch is to turn a device on or off. The actual switch can be implemented as a pull chain, simple two position switch, or a variety of dimmer switches.

please see reference:  https://sourcemaking.com/design_patterns/bridge 
