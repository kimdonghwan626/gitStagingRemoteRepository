package gitTest;

import bxm.common.annotaion.BxmCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *
 * @author sysadmin
 */
@RestController
@RequestMapping("/")
@BxmCategory(logicalName="컨트롤러 리소스", description="")
public class ContorllerResource {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	private int i;
}
