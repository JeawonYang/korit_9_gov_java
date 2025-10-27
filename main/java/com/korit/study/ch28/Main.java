package com.korit.study.ch28;

interface ClickListener {
    void onClick();
}

class Button {
    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다!");
            }
        });

        button.click();
    }
}