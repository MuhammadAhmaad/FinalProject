import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.udacity.gradle.builditbigger.EndPointAsyncTask;
import com.udacity.gradle.builditbigger.OnFetched;
import com.udacity.gradle.builditbigger.R;

import example.example.com.androidjoketeller.JokeTellerActivity;

public class MainActivityFragment extends Fragment implements OnFetched {

    Button tellJokeButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        tellJokeButton = (Button) root.findViewById(R.id.instructions_button);
        tellJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new EndPointAsyncTask(MainActivityFragment.this).execute();
            }
        });
        return root;
    }

    @Override
    public void onJokeFetched(String joke) {
        Intent intent = new Intent(getContext(), JokeTellerActivity.class);
        intent.putExtra(JokeTellerActivity.JOKE, joke);
        startActivity(intent);
    }
}
