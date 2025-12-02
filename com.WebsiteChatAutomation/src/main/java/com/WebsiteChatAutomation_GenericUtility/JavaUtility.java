package com.WebsiteChatAutomation_GenericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	public String LocalDateAndTime()
	{
		String time = LocalDateTime.now().toString().replace(".","").replace("-","").replace(":","");
		return time;
	}

}
