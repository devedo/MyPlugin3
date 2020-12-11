package com.test.plugin.MyPlugin;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Goal which touches a timestamp file.
 *
 * @deprecated Don't use!
 */
@Mojo(name = "julaiCheck" , defaultPhase = LifecyclePhase.CLEAN)
public class MyMojo extends AbstractMojo {
	/**
	 * Location of the file.
	 */
	@Parameter(defaultValue = "${project.build.directory}",  property = "outputDir", required = true)
	private File outputDirectory;
//	
	@Parameter(defaultValue = "${myvalue.hello}", property = "param1", required = true)
	private String param1;

	@Parameter(defaultValue = "${project.parent.basedir}", property = "parentBasedir")
	private String parentBaseDir;

	
	@Parameter(defaultValue = "${project}", required = true, readonly = true)
	private MavenProject project;
	
	public void execute() throws MojoExecutionException {
//		File f = outputDirectory;
		
		
		
		
		
		getLog().info("project.getDependencies():"+project.getDependencies());
		getLog().info("param1:"+param1);
		getLog().info("outputDir:"+outputDirectory);
		
		
		
//		getLog().info("param1: "+param1);
//		getLog().info("outputDirectory c: "+outputDirectory);
		
//
//		if (!f.exists()) {
//			f.mkdirs();
//		}
//
//		File touch = new File(f, "touch.txt");
//
//		FileWriter w = null;
//		try {
//			w = new FileWriter(touch);
//
//			w.write("touch.txt");
//		} catch (IOException e) {
//			throw new MojoExecutionException("Error creating file " + touch, e);
//		} finally {
//			if (w != null) {
//				try {
//					w.close();
//				} catch (IOException e) {
//					// ignore
//				}
//			}
//		}
	}
}
