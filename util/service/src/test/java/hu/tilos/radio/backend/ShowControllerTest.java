package hu.tilos.radio.backend;

import hu.tilos.radio.backend.data.types.ShowDetailed;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

public class ShowControllerTest {

    private static EntityManagerFactory emf;

    @BeforeClass
    public static void init() {
        emf = TestUtil.initPersistence();
        TestUtil.inidTestData();
    }

    @Test
    public void testGet() throws Exception {
        //given

        ShowController controller = new ShowController();
        controller.setEntityManager(emf.createEntityManager());

        //when
        ShowDetailed show = controller.get("3utas");

        //then
        Assert.assertEquals("3utas", show.getAlias());
        Assert.assertEquals("3. utas", show.getName());

        Assert.assertEquals(2, show.getMixes().size());
        Assert.assertEquals("asd.mp3", show.getMixes().get(0).getFile());

        Assert.assertEquals(2, show.getContributors().size());

        Assert.assertEquals("AUTHOR1", show.getContributors().get(0).getAuthor().getName());
    }
}