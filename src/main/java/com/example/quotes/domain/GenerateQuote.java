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

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatOptions;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class GenerateQuote {

	private VertexAiGeminiChatModel chatClient;
	private Environment env;

	public GenerateQuote(VertexAiGeminiChatModel chatClient, Environment env){
		this.chatClient = chatClient;
		this.env = env;
	}

	//use chatClient in findRandomQuote
	public Quote findRandomQuote() {
//		ChatResponse chatResponse = chatClient.call(new Prompt("Give me a quote from a classic book... ",
//				VertexAiGeminiChatOptions.builder()
//						.withTemperature(0.4f)
//						.build())
//		);
//		System.out.println(chatResponse.getResult().getOutput().getContent());
		return new Quote();
	}


}