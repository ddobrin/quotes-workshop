/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.quotes.domain;

import java.util.Scanner;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatOptions;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenerateQuote {
	


	public static void findRandomQuote() {}
	ApplicationRunner applicationRunner(
			VertexAiGeminiChatModel geminiChatModel) {

		return args -> {
	
		String book = "";
		String prompt = "";
			long start = System.currentTimeMillis();
			// TODO: Fill out the below line to call the Gemini chat model and print the generated quote. 
			System.out.println();
			System.out.println("VertexAI Gemini call took " + (System.currentTimeMillis() - start) + " ms");
		};
	}




	// potential solution
	/* public static void randomQuote2() {}
	@Bean
	ApplicationRunner applicationRunner(
			VertexAiGeminiChatModel geminiChatModel) {

		return args -> {
			Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the book name: ");
		String book = scanner.nextLine();
		String prompt = String.format("You are an experienced literary critic. Please extract a famous quote from the book %s", book);

			long start = System.currentTimeMillis();
			return ("VERTEX_AI_GEMINI: " + geminiChatModel
					.call(
							new Prompt(prompt,
									VertexAiGeminiChatOptions.builder()
											.withTemperature(0.2f).build())
					).getResult().getOutput().getContent());
			System.out.println("VertexAI Gemini call took " + (System.currentTimeMillis() - start) + " ms");
		};
	} */


}