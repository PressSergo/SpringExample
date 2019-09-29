import DaoImpl.PlainSingerDao;
import org.junit.Test;

public class TestPlainSingerDao {

    @Test
    public void testLoad(){
        PlainSingerDao plainSingerDao = new PlainSingerDao();
        plainSingerDao.findAll();
    }
}
