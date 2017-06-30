/**
 * Created by liwei on 2017/5/24 0024.
 */

"use strict";
var FunctionContainer = function () {
    return{
        getFunctionName :function () {
            if(arguments[0] instanceof Function){
                return arguments[0].getFunctionName();
            }
        }
    }
}