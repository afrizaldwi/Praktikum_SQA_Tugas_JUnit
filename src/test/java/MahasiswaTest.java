
import com.mycompany.praktikum_sqa_tugas_junit.Mahasiswa;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author afrizal
 */
public class MahasiswaTest {

    @Test
    void testNilaiLulus() {
        // Test boundary (exactly 60) and a safe passing grade
        Mahasiswa mhs1 = new Mahasiswa("Budi", 60);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 85);

        assertTrue(mhs1.isLulus(), "Nilai 60 seharusnya lulus");
        assertTrue(mhs2.isLulus(), "Nilai 85 seharusnya lulus");
    }

    @Test
    void testNilaiTidakLulus() {
        // Test failing grade
        Mahasiswa mhs = new Mahasiswa("Andi", 59);

        assertFalse(mhs.isLulus(), "Nilai 59 seharusnya tidak lulus");
    }
}
