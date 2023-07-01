package com.example.likeimage;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class LikesViewModel extends ViewModel {

    private MutableLiveData<String> nome;
    private MutableLiveData<String> sobrenome;
    private MutableLiveData<Integer> like;

    private MutableLiveData<Integer> imagem;

    public LikesViewModel() {
        imagem = new MutableLiveData<>(R.drawable.like);
        nome = new MutableLiveData<>("Bruno");
        sobrenome = new MutableLiveData<>("Silva");
        like = new MutableLiveData<>(0);
    }

    public MutableLiveData<Integer> getLike() {
        return like;
    }

    public MutableLiveData<String> getNome() {
        return nome;
    }

    public MutableLiveData<String> getSobrenome() {
        return sobrenome;
    }

    public LiveData<Integer> getImagem() {
        return imagem;
    }

    public void darLike() {
        like.setValue((like.getValue()+1));
        if(like.getValue() <= 3){
            imagem.setValue(R.drawable.like);
        } else if (like.getValue() <= 9) {
            imagem.setValue(R.drawable.coracao);
        } else {
            imagem.setValue(R.drawable.fogo);
        }
    }
}

