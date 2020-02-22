import{ Calculator} from "./calculator";
describe('testing calculator class', function(){
    it('test add function', function(){
        let cal = new Calculator();

        let actualResult = cal.addNumbers(10,20);
        let expectedResult= 30;
        expect(actualResult).toBe(expectedResult)
    })


    it('test subtract function', function(){
        let cal = new Calculator();

        let actualResult = cal.subtractNumber(60,20);
        let expectedResult= 40;
        expect(actualResult).toBe(expectedResult)
    })
    
})
