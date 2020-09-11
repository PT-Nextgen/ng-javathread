package id.ng;

public class MainThread {

	public static void main(String[] args) {
		String namaThreadUtama = Thread.currentThread().getName();
		System.out.println("Nama thread utama : " + namaThreadUtama);
		
		Thread kasirBaru = new Thread(new KasirBaru());
		kasirBaru.start();
		
		// kasir lama melayani pembeli nomor 1 sampai 6
		for (int pembeli = 1; pembeli <= 6; pembeli++) {
			System.out.println(namaThreadUtama + " melayani pembeli nomor " + pembeli);
		}
	}
}
