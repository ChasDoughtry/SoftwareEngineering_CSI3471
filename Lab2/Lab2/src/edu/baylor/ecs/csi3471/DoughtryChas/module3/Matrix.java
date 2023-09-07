package edu.baylor.ecs.csi3471.DoughtryChas.module3;

public class Matrix {
    int width;
    int height;
    int [][] arr;
    Matrix(int h, int w){
        width = w;
        height = h;
        arr = new int[height][width];

        for(int i = 0; i < height; i++){
            for(int j = 0 ; j < width; j++){
                arr[i][j] = (int)(Math.random() * 10);
            }
        }

    }
    void Addition(Matrix matrix2) throws Exception{

        if (this.height != matrix2.height || this.width != matrix2.width) {
            throw new Exception("Matrices not equivalent");
        }

        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++){
                this.arr[i][j] += matrix2.arr[i][j];
            }
        }
    }
    void testAddition(Matrix matrix2){
        try {
            System.out.println("Before Addition:\nMatrix 1:");
            this.print();
            System.out.println("\nMatrix 2:");
            matrix2.print();

            this.Addition(matrix2);

            System.out.println("\nResult:");
            this.print();

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    void Subtraction(Matrix matrix2) throws Exception{

        if (this.height != matrix2.height || this.width != matrix2.width) {
            throw new Exception("Matrices not equivalent");
        }

        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++){
                this.arr[i][j] -= matrix2.arr[i][j];
            }
        }
    }
    void testSubtraction(Matrix matrix2){

        try {
            System.out.println("Before Subtraction:\nMatrix 1:");
            this.print();
            System.out.println("\nMatrix 2:");
            matrix2.print();

            this.Subtraction(matrix2);

            System.out.println("\nResult:");
            this.print();

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    Matrix Multiplication(Matrix matrix2) throws Exception{
        if(this.width != matrix2.height){
            throw new Exception("Matrices cannot be multiplied.");
        }
        Matrix result = new Matrix(this.height, matrix2.width);

        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < matrix2.width; j++){
                result.arr[i][j] = 0;
                for(int k = 0; k < matrix2.height; k++){
                    result.arr[i][j] += (this.arr[i][k] * matrix2.arr[k][j]);
                }
            }
        }

        return result;
    }
    void testMultiplication(Matrix matrix2){

        try {
            Matrix result;
            System.out.println("Before Multiplication:\nMatrix 1:");
            this.print();
            System.out.println("\nMatrix 2:");
            matrix2.print();

            result = this.Multiplication(matrix2);

            System.out.println("\nResult:");
            result.print();

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    void print(){

        for (int i = 0; i < this.height; i++) {
            System.out.print("[");
            for (int j = 0; j < this.width; j++){
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }
    public static void main (String[] args){

        try {
            Matrix test1 = new Matrix(2, 2);
            Matrix test2 = new Matrix(2, 2);
            Matrix test3 = new Matrix(2,2);

            test1.testAddition(test2);
            test2.testSubtraction(test1);
            test1.testMultiplication(test3);

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
