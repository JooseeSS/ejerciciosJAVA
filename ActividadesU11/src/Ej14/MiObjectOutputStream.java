package Ej14;

	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.io.OutputStream;

	// Clase necesaria para hacer append sin corromper el archivo binario
	public class MiObjectOutputStream extends ObjectOutputStream {

		public MiObjectOutputStream(OutputStream out) throws IOException {
			super(out);
		}

		@Override
		protected void writeStreamHeader() throws IOException {
			// Lo dejamos vacío y reseteamos para no escribir una cabecera nueva
			// y evitar el error StreamCorruptedException al leer después.
			reset();
		}
	}
