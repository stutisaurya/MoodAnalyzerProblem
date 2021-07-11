package com.moodanalyzer;

public class MoodAnalyser {

	public String message;

	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {
		this.message = message;
	}

	public String exceptionAnalyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,
						"please enter proper message");
			if (message.contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

}