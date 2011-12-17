package validar
{
	import mx.collections.ArrayCollection;

	public class Validacion
	{
		/**
		 * valida si el campo es un numero
		 */
		public function validaMonto(numero:String):String{
			var num:int = parseInt(numero);
			var retorno:String;
			if (num<=0){
				retorno = "Debe ingresar SOLO números mayores a cero en el monto";
			}
			return retorno;
		}
		
		public function validaApuesta(monto:int, caballo:ArrayCollection, idCarrera:int, idCaja:int):Boolean{
			var respuesta:Boolean = true;
			if ((monto == 0) || (caballo == null) || (idCarrera == 0) || (idCaja == 0)){
				respuesta = false
			}
			return respuesta;
		}
		
		public function validaEstimacion(idCarrera:int, caballo:ArrayCollection, monto:int):Boolean{
			var respuesta:Boolean = true;
			if ((monto == 0) || (caballo == null) || (idCarrera == 0)){
				respuesta = false
			}
			return respuesta;
		}
	}
}