//pewarisan interface

public class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("Nama Mahasiswa adalah Dewi");
		
	}

	@Override
	public int stb() {
		return 92;
	}
	
	@Override
	public String mk() {
		return "PBO";
	}
	
}
