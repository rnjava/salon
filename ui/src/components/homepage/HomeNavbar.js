import Container from 'react-bootstrap/Container';
import Navbar from 'react-bootstrap/Navbar';


const HomeNavbar = () => {
  return (
    <>
    <Navbar bg="dark">
    </Navbar>
    <br />
    <Navbar bg="dark" variant="dark">
      <Container>
        <Navbar.Brand href="#home">
          Ar Salon & Day Spa
        </Navbar.Brand>
      </Container>
    </Navbar>
  </>
  )
}

export default HomeNavbar