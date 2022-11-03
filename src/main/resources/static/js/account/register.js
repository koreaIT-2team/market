const registerButton = document.querySelector(".register-btn");

registerButton.onclick = () => {
    const accountInputs = document.querySelectorAll(".register-input");

    let user = {
        UserId: accountInputs[0].value,
        Username: accountInputs[1].value,
        email: accountInputs[2].value,
        password: accountInputs[3].value
    }


    $.ajax({
            async: false,                       //필수
            type: "post",                       //필수
            url: "/api/lakickz/register",       //필수
            contentType: "application/json",    //전송할 데이터가 json인 경우
            data: JSON.stringify(user),         //전송할 데이터가 있으면
            dataType: "json",                   //json외 text 등을 사용할 수 있지만 json 사용함
            success: (response) => {
                    console.log(response);      //성공시에 실행될 메소드
            },
            error: (error) => {                 //실패시에 실행될 메소드
                console.log(error.responseJSON.data);
                loadErrorMessage(error.responseJSON.data);
            }
        });

}

function loadErrorMessage(errors) {
    const errorList = document.querySelector(".errors");
    const errorMsgs = document.querySelector(".error-msgs");
    const errorArray = Object.values(errors);

    errorMsgs.innerHTML = "";

    errorArray.forEach(error => {
        errorMsgs.innerHTML += `
            <li>${error}</li>
        `;
    });

    errorList.classList.remove("errors-invisible");
}