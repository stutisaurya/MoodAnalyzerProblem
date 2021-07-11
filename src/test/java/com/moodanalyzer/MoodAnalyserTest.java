package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	private static void analyseMood(String string) {

	}

	@Test
	public void givenSadMessageReturnSad() {
		MoodAnalyser MoodAnalyserTest = new MoodAnalyser();
		String mood = MoodAnalyserTest.analyseMood("Hello i am Sad");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenHappyMessageReturnHappy() {
		MoodAnalyser MoodAnalyserTest = new MoodAnalyser();
		String mood = MoodAnalyserTest.analyseMood("Hello i am Happy");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNullMassageShouldReturnHappyMessage() throws MoodAnalysisException {
		MoodAnalyser MoodAnalyserTest = new MoodAnalyser(null);
		String mood = MoodAnalyserTest.exceptionAnalyseMood();
		Assert.assertEquals("HAPPY", mood);

	}

	@Test
	public void givenEmptyMessageShouldReturnThrowCustomException() throws MoodAnalysisException {
		MoodAnalyser moodAnalyzer = new MoodAnalyser(" ");
		MoodAnalyserTest.analyseMood(" ");
	}

}
