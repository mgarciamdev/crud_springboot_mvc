function eliminar(id) {
    Swal.fire({
        title: "Are you sure?",
        text: "You won't be able to revert this!",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Yes, delete it!"
    }).then((result) => {
        if(result.isConfirmed){  // Corregir aquí, usar result.isConfirmed
            $.ajax({
                url: "/eliminar/" + id,
                success: function (res){
                    console.log(res);
                },
            });
            Swal.fire({
                title: "Deleted!",
                text: "Your file has been deleted.",
                icon: "success"
            }).then((ok) => {
                if (ok.isConfirmed) {
                    location.href = "/listar";
                }
            });
        } else {
            Swal.fire({
                text: "Your file is safe!"
            });
        }
    });
}
