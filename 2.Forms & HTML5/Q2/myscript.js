    function callme(){
        var fname = document.getElementById('fname').value;
        sessionStorage.setItem('fname', fname);
        
        var lname = document.getElementById('lname').value;
        sessionStorage.setItem('lname', lname);
    }

    function myFunction() {
        alert(sessionStorage.getItem('fname') +" "+ sessionStorage.getItem('lname'));
      }