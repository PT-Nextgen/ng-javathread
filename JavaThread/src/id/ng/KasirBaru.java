package id.ng;

public class KasirBaru implements Runnable {

	@Override
	public void run() {
		String namaThreadBaru = Thread.currentThread().getName();
		System.out.println("Nama thread baru : " + namaThreadBaru);
		
		// kasir baru melayani pembeli nomor 7 sampai 12
		for (int pembeli = 7; pembeli <= 12; pembeli++) {
			System.out.println(namaThreadBaru + " melayani pembeli nomor " + pembeli);
		}
	}

}
