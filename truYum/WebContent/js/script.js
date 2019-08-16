var n = 1,p = 1, d=1 , c =1 ;
function nameValidation(){
                var val = document.getElementById('name').value;
                var regex = /^[_A-z]*((-|\s)*[_A-z])*$/g;
                var isValid=regex.test(val);
                var msg = "";
                if(val == "" || val == null){
                   msg="Title is required.";
                }
                else if(val.length < 2 || val.length > 65){
                    msg="Title should have 2 to 65 characters.";
                }
                else{
                    msg = "";
                    n = 0;
                }
                
                document.getElementById("name-validation").innerHTML=msg;
}
function dateOfLaunch(){
                
}
function validate(event){
                var val=document.getElementById('price').value;
                var regex = /^[0-9]*$/g;
                var isValid=regex.test(val);
                var msg = "";
                if(val == "" || val == null){
                    msg="Price is required.&emsp;&emsp;&emsp;&ensp;&ensp;";
                }
                else if(isValid == false){
                    msg = "Price has to be a number.";
                }
                else{
                    msg = "";
                    p = 0;
                }
                
                document.getElementById("price-validation").innerHTML=msg;
                var valDateOfLaunch = document.getElementById('dateOfLaunch').value;
                msg="";
                if(valDateOfLaunch == "" || val == null){
                   msg = "Date of Launch is required.";
                }
                else{
                                d = 0;
                }
                document.getElementById("date-of-launch-validation").innerHTML=msg;
                var valCategory = document.getElementById('category').value;
                var msg="";
                if(valCategory == "" || val== null){
                   msg="Select one category";
                }
                else{
                                c = 0;
                }
                document.getElementById("category-validation").innerHTML=msg;
                if(n == 1 || p == 1 || d == 1 || c == 1){
                                event.preventDefault();
                }
}
