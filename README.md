# Fragmentcommunication

The communication between fragments should not be done directly. There are two ways of doing so.

1.Help of ViewModel
2.Help of Interface

To allow a Fragment to communicate up to its Activity, you can define an interface in the Fragment class and implement it within the Activity.
The Fragment captures the interface implementation during its onAttach() lifecycle method and can then call the 
Interface methods to communicate with the Activity.
There is a simple way to implement communication between fragments of an activity using architectural components. Data can be passed between fragments of an activity using ViewModel and LiveData.
Fragments involved in communication need to use the same view model objects which is tied to activity life cycle. The view model object contains livedata object to which data is passed by one fragment and the second fragment listens for changes on LiveData and 
receives the data sent from fragment one.
