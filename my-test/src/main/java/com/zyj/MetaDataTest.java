package com.zyj;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

public class MetaDataTest {
	public static void main(String[] args) throws IOException {
		SimpleMetadataReaderFactory simpleMetadataReaderFactory = new SimpleMetadataReaderFactory();
		MetadataReader metadataReader = simpleMetadataReaderFactory.getMetadataReader("com.zyj.service.UserService");
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println(classMetadata.getClassName());
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		annotationMetadata.getAnnotationTypes().forEach(System.out::println);
	}
}
