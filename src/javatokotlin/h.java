/*
package javatokotlin;

import java.io.File;

public class h {
    public static voidcreateFile(){
        final String utteranceId = "myTestingId";
        File destinationFile = new File(getCacheDir(), utteranceId + ".wav");
        String mTts;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mTts.synthesizeToFile(textToConvert, null, destinationFile, utteranceId);
        } else {
            Bundle params = new Bundle();
            params.putString(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, utteranceId);
            mTts.synthesizeToFile(textToConvert, param, destinationFile.getPath());
            )
            mTts.setOnUtteranceCompletedListener(new TextToSpeech.OnUtteranceCompletedListener() {
                @Override
                public void onUtteranceCompleted(String s) {
                    if (s.equals(utteranceId)) {
                        // start playing the audio file defined at myTestingId.wav

                    }
                }
            });
        }
}
*/
