package coachingmateanalytics.coachingmate.dao;

import coachingmateanalytics.coachingmate.AppTest;
import coachingmateanalytics.coachingmate.dao.ActivityDao;
import coachingmateanalytics.coachingmate.entity.Activity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @Date: 24/9/20 12:04
 * @Description:
 */
class ActivityDaoImplTest extends AppTest {
    private static final Logger logger = LoggerFactory.getLogger(ActivityDaoImplTest.class);

    @Autowired
    private ActivityDao activityDao;

    @Test
    void saveActivity() {
        Activity activity = new Activity("3f3d5af3-7847-413e-a9fe-47aeffb6de44", "testData2");
        activityDao.saveActivity(activity);
    }

    @Test
    void findAllByAccessToken() {
        List<Activity> allByAccessToken = activityDao.findAllByAccessToken("3f3d5af3-7847-413e-a9fe-47aeffb6de44");
        int i = 1;
        for (Activity activity : allByAccessToken) {
            logger.info(activity.getAccessToken() + i + " : " + activity.getData());
        }

        logger.info("total count : " + allByAccessToken.size());
    }
}