package com.xiaoju.uemc.turbo.engine.runner;

import com.didiglobal.reportlogger.LoggerFactory;
import com.didiglobal.reportlogger.ReportLogger;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Stefanie on 2019/12/1.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestEngineApplication.class)
public class BaseTest {

    protected static final ReportLogger LOGGER = LoggerFactory.getLogger(BaseTest.class);
}