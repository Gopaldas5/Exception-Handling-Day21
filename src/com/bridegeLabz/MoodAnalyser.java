package com.bridegeLabz;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood(String message){
        try{
            this.message = message;
            return analyseMood();
        }catch (MoodAnalysisException e){
            return "Happy";
        }
    }
    public String analyseMood() throws MoodAnalysisException{
        try {
            if (message.contains("sad")){
                return "SAD";
            }else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalysisException("Please enter proper input");
        }
    }
}
