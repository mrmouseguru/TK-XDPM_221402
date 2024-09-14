public class AddUseCaseControl {

    //fields
    private AddEntity addEntity = null;
    private AddUIConsoleOutput addUIConsoleOutput = null;
    //methods

    public void execute(RequestData requestData) {
        

        //nhan 2 so
        //tham dinh
        //ok 
        int result = addEntity.add();

        ResponseData responseData = new ResponseData();
        responseData.sumResult = result;
        //
        addUIConsoleOutput.output(responseData);

    }

}
