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
            async: false,
            type: "post",
            url: "/api/account/register",
            contentType: "application/json",
            data: JSON.stringify(user),
            dataType: "json",
            success: (response) => {
                    console.log(response);
            },
            error: (error) => {
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
