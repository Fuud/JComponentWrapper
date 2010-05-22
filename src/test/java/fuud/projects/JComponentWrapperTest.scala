package fuud.projects

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitSuite
import javax.swing._
import org.junit.Test
import org.junit.Assert._

class JComponentWrapperTest extends FlatSpec with ShouldMatchers with JUnitSuite {
  @Test
  def test_getWrappedComponent {
    val component = new JPanel()
    val wrappedComponent: JComponent = new JComponentWrapper(component) {
      override def getWrappedComponent() = super.getWrappedComponent
    }.getWrappedComponent
    
    assertEquals(component, wrappedComponent)
  }
}