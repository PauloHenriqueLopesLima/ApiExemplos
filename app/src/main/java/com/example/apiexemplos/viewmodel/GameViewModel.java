package com.example.apiexemplos.viewmodel;

import android.app.Application;
import com.example.apiexemplos.model.Game;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.disposables.CompositeDisposable;

public class GameViewModel extends AndroidViewModel {

    private MutableLiveData<List<Game>> gameLiveData = new MutableLiveData<>();

    private CompositeDisposable disposable = new CompositeDisposable();

    public GameViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<Game>> getGameLiveData() {
        return gameLiveData;
    }
}
