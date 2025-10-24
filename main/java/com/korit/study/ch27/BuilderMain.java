package com.korit.study.ch27;

public class BuilderMain {
    public static void main(String[] args) {
        BuilderStudy builderStudy = new BuilderStudy("김준일", 32);
        // BuildeStudy는 static이기때문에 호출 가능 -> BuilderStudy.builder객체

        BuilderStudy builderStudy1 = BuilderStudy.builder()
                .value1("김준일")
                .value2(32)
                .build();
        Product product = Product.builder()
                .name("상품1")
                .price(1000)
                .size("L")
                .build();
        System.out.println(product);

        ComputerBuilder computerBuilder = Computer.builder();
        computerBuilder.setCpu("i7");
        computerBuilder.setRam(8);
        Computer computer = computerBuilder.build();

        ComputerBuilder computerBuilder2 = Computer.builder().cpu("i5").ram(16);
        Computer computer2 = computerBuilder2.build();

        Computer computer3 = Computer.builder()
                .cpu("i9")
                .ram(32)
                .build();


    }
}



