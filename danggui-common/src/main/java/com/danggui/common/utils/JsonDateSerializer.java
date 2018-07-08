package com.danggui.common.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Long时间格式化化为标准时间
 * @author GongXings
 * @date 2018年7月8日
 */
public class JsonDateSerializer extends JsonSerializer<Long> {
	   private SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	   @Override  
	   public void serialize(Long datel, JsonGenerator gen, SerializerProvider provider)  throws IOException, JsonProcessingException {  
		   if(datel.toString().length()<13){
		       datel= datel*1000L;
		   }
	       Date date= new Date(datel);
	       String value = dateFormat.format(date);  
	       gen.writeString(value);  
	   }  
	}  