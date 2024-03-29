/**
 * This is a generated class and is not intended for modification.  To customize behavior
 * of this service wrapper you may modify the generated sub-class of this class - ApuestaSOA.as.
 */
package services.apuestasoa
{
import com.adobe.fiber.core.model_internal;
import com.adobe.fiber.services.wrapper.WebServiceWrapper;
import com.adobe.serializers.utility.TypeUtility;
import mx.rpc.AbstractOperation;
import mx.rpc.AsyncToken;
import mx.rpc.soap.mxml.Operation;
import mx.rpc.soap.mxml.WebService;

[ExcludeClass]
internal class _Super_ApuestaSOA extends com.adobe.fiber.services.wrapper.WebServiceWrapper
{
    
    // Constructor
    public function _Super_ApuestaSOA()
    {
        // initialize service control
        _serviceControl = new mx.rpc.soap.mxml.WebService();
        var operations:Object = new Object();
        var operation:mx.rpc.soap.mxml.Operation;

        operation = new mx.rpc.soap.mxml.Operation(null, "add");
         operation.resultType = String;
        operations["add"] = operation;

        operation = new mx.rpc.soap.mxml.Operation(null, "montoAPagar");
         operation.resultType = String;
        operations["montoAPagar"] = operation;

        operation = new mx.rpc.soap.mxml.Operation(null, "montoByCaballo");
         operation.resultType = int;
        operations["montoByCaballo"] = operation;

        operation = new mx.rpc.soap.mxml.Operation(null, "getAll");
         operation.resultType = String;
        operations["getAll"] = operation;

        operation = new mx.rpc.soap.mxml.Operation(null, "montoByCarrera");
         operation.resultType = int;
        operations["montoByCarrera"] = operation;

        _serviceControl.operations = operations;
        try
        {
            _serviceControl.convertResultHandler = com.adobe.serializers.utility.TypeUtility.convertResultHandler;
        }
        catch (e: Error)
        { /* Flex 3.4 and earlier does not support the convertResultHandler functionality. */ }


        preInitializeService();
        model_internal::initialize();
    }
    
    //init initialization routine here, child class to override
    protected function preInitializeService():void
    {


        _serviceControl.service = "ApuestaSOAService";
        _serviceControl.port = "ApuestaSOA";
        wsdl = "http://localhost:8080/ApuestaSOA/services/ApuestaSOA?wsdl";
        model_internal::loadWSDLIfNecessary();
    }
    

    /**
      * This method is a generated wrapper used to call the 'add' operation. It returns an mx.rpc.AsyncToken whose 
      * result property will be populated with the result of the operation when the server response is received. 
      * To use this result from MXML code, define a CallResponder component and assign its token property to this method's return value. 
      * You can then bind to CallResponder.lastResult or listen for the CallResponder.result or fault events.
      *
      * @see mx.rpc.AsyncToken
      * @see mx.rpc.CallResponder 
      *
      * @return an mx.rpc.AsyncToken whose result property will be populated with the result of the operation when the server response is received.
      */
    public function add(monto:int, idCaballo:int, idCarrera:int, idCaja:int) : mx.rpc.AsyncToken
    {
        model_internal::loadWSDLIfNecessary();
        var _internal_operation:mx.rpc.AbstractOperation = _serviceControl.getOperation("add");
		var _internal_token:mx.rpc.AsyncToken = _internal_operation.send(monto,idCaballo,idCarrera,idCaja) ;
        return _internal_token;
    }
     
    /**
      * This method is a generated wrapper used to call the 'montoAPagar' operation. It returns an mx.rpc.AsyncToken whose 
      * result property will be populated with the result of the operation when the server response is received. 
      * To use this result from MXML code, define a CallResponder component and assign its token property to this method's return value. 
      * You can then bind to CallResponder.lastResult or listen for the CallResponder.result or fault events.
      *
      * @see mx.rpc.AsyncToken
      * @see mx.rpc.CallResponder 
      *
      * @return an mx.rpc.AsyncToken whose result property will be populated with the result of the operation when the server response is received.
      */
    public function montoAPagar(idCarrera:int, idCaballo:int, monto:int) : mx.rpc.AsyncToken
    {
        model_internal::loadWSDLIfNecessary();
        var _internal_operation:mx.rpc.AbstractOperation = _serviceControl.getOperation("montoAPagar");
		var _internal_token:mx.rpc.AsyncToken = _internal_operation.send(idCarrera,idCaballo,monto) ;
        return _internal_token;
    }
     
    /**
      * This method is a generated wrapper used to call the 'montoByCaballo' operation. It returns an mx.rpc.AsyncToken whose 
      * result property will be populated with the result of the operation when the server response is received. 
      * To use this result from MXML code, define a CallResponder component and assign its token property to this method's return value. 
      * You can then bind to CallResponder.lastResult or listen for the CallResponder.result or fault events.
      *
      * @see mx.rpc.AsyncToken
      * @see mx.rpc.CallResponder 
      *
      * @return an mx.rpc.AsyncToken whose result property will be populated with the result of the operation when the server response is received.
      */
    public function montoByCaballo(idCaballo:int, idCarrera:int) : mx.rpc.AsyncToken
    {
        model_internal::loadWSDLIfNecessary();
        var _internal_operation:mx.rpc.AbstractOperation = _serviceControl.getOperation("montoByCaballo");
		var _internal_token:mx.rpc.AsyncToken = _internal_operation.send(idCaballo,idCarrera) ;
        return _internal_token;
    }
     
    /**
      * This method is a generated wrapper used to call the 'getAll' operation. It returns an mx.rpc.AsyncToken whose 
      * result property will be populated with the result of the operation when the server response is received. 
      * To use this result from MXML code, define a CallResponder component and assign its token property to this method's return value. 
      * You can then bind to CallResponder.lastResult or listen for the CallResponder.result or fault events.
      *
      * @see mx.rpc.AsyncToken
      * @see mx.rpc.CallResponder 
      *
      * @return an mx.rpc.AsyncToken whose result property will be populated with the result of the operation when the server response is received.
      */
    public function getAll() : mx.rpc.AsyncToken
    {
        model_internal::loadWSDLIfNecessary();
        var _internal_operation:mx.rpc.AbstractOperation = _serviceControl.getOperation("getAll");
		var _internal_token:mx.rpc.AsyncToken = _internal_operation.send() ;
        return _internal_token;
    }
     
    /**
      * This method is a generated wrapper used to call the 'montoByCarrera' operation. It returns an mx.rpc.AsyncToken whose 
      * result property will be populated with the result of the operation when the server response is received. 
      * To use this result from MXML code, define a CallResponder component and assign its token property to this method's return value. 
      * You can then bind to CallResponder.lastResult or listen for the CallResponder.result or fault events.
      *
      * @see mx.rpc.AsyncToken
      * @see mx.rpc.CallResponder 
      *
      * @return an mx.rpc.AsyncToken whose result property will be populated with the result of the operation when the server response is received.
      */
    public function montoByCarrera(idCarrera:int) : mx.rpc.AsyncToken
    {
        model_internal::loadWSDLIfNecessary();
        var _internal_operation:mx.rpc.AbstractOperation = _serviceControl.getOperation("montoByCarrera");
		var _internal_token:mx.rpc.AsyncToken = _internal_operation.send(idCarrera) ;
        return _internal_token;
    }
     
}

}
